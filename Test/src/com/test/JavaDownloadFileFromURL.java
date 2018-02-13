package com.test;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class JavaDownloadFileFromURL {

    public static void main(String[] args) {
        String url[] ={"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ibrep.client.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ibrep.core.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ibrep.rb.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ib.client.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ib.core.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ib.rb.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ib.mt.gui.lib.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ib.mt.rb.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ib.mt.util.lib.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ib.mapping.lib.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ib.upload.core.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ib.upload.sap.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xi.mapping.tool.lib_api.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xi.flib.lib_api.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.aii.utilxi.core.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.aii.utilxi.gui.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.util.rb.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.aii.proxy.gen.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/frog.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ibrep.core.subn.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jta.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/ejb20.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/sap.com~tc~sapxmltoolkit~sapxmltoolkit.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/sap.com~tc~exception~impl.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/sap.com~tc~logging~java~impl.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/sap.com~tc~bl~guidgenerator~impl.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jperflib.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/sap.com~tc~bl~ni~impl.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/sap.com~tc~je~clientlib~impl.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/sap.com~tc~bl~jarm~jarm.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/tenComposite.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/tenGraph.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/tenGraphics.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/tenGenerics.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/tenGui.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/tenGuiResource.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ibrep.maestro.core.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/com.sap.xpi.ibrep.maestro.model.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/tenSkeleton.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/tenLookAndFeel.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jaxb-api.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jaxb-impl.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jaxb-xjc.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jsr173_1.0_api.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/activation.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jaxb-api-2.1.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jide-2.7.5.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/JimiProClasses-1.0.0.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/client.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jsr-1.7.3.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jxlayer-1.0.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/filters-2.0.235.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-reportdesigner-client-3.3.0-486419.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-annotations-1.0.0-346691.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-spellchecker-dictionaries-1.0.0-SNAPSHOT.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-spellchecker-1.0.0-SNAPSHOT.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/scptlang_en_help.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/commons-digester-1.8.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/commons-collections-3.2.1.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/arismethod.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/cl_locale.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/cl_locale_de.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/cl_locale_en.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/mail-1.4.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jh-2.0_03.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/js-1.7R2.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-6.2.0.1.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-reportexecution-3.0.0-474547.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-reportdesigner-common-3.3.0-454947.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-graphics-3.3.1-471587.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-graphlayout-2.8.6-463383.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-guiframework-6.21.52-738883.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-lipo-1.1.2-416426.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/y-utils-2.2.4-469928.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/jdom-1.1.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/iaik_jsse.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/iaik_smime.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/iaik_ssl.jar",
        		"http://VISUINFO.GLOBAL.COM:57300/rep/repository/w3c_http.jar"};
        
        try {
        	for(int i=0;i<url.length;i++)
        	{
            downloadUsingNIO(url[i], "D:/jar/"+(url[i].substring(url[i].indexOf("repository/"))).replace("repository/",""));
        	}
            
           // downloadUsingStream(url, "/Users/pankaj/sitemap_stream.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void downloadUsingStream(String urlStr, String file) throws IOException{
        URL url = new URL(urlStr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        while((count = bis.read(buffer,0,1024)) != -1)
        {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }

    private static void downloadUsingNIO(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }

}