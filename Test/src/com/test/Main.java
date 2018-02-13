package com.test;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.users.FullAccount;

import java.util.List;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Main {
    private static final String ACCESS_TOKEN = "1OO59y2diMAAAAAAAAAAIDCrsVQH9N6JbgpEhl2XoHGzAABQKpprNBogiBaf3gfX";

    public static void main(String args[]) throws DbxException, IOException {
        // Create Dropbox client
        DbxRequestConfig config = new DbxRequestConfig("dropbox/java-tutorial", "en_US");
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        // Get current account info
        FullAccount account = client.users().getCurrentAccount();
        System.out.println(account.getName().getDisplayName());

        // Get files and folder metadata from Dropbox root directory
        ListFolderResult result = client.files().listFolder("");
        while (true) {
            for (Metadata metadata : result.getEntries()) {
                System.out.println(metadata.getPathLower());
            }

            if (!result.getHasMore()) {
                break;
            }

            result = client.files().listFolderContinue(result.getCursor());
        }

        // Upload "test.txt" to Dropbox
        try (InputStream in = new FileInputStream("D:\\download.jar")) {
            FileMetadata metadata = client.files().uploadBuilder("/download.jar")
                .uploadAndFinish(in);
        }
        try
        {
            //output file for download --> storage location on local system to download file
            OutputStream downloadFile = new FileOutputStream("D:\\test");
            try
            {
            FileMetadata metadata = client.files().downloadBuilder("/java.rar")
                    .download(downloadFile);
            }
            finally
            {
                downloadFile.close();
            }
        }
        //exception handled
        catch (DbxException e)
        {
            //error downloading file
            System.out.println("Unable to download file to local system\n Error: " + e);
        }
        catch (IOException e)
        {
            //error downloading file
        	 System.out.println("Unable to download file to local system\n Error: " + e);
        }
    }
}
