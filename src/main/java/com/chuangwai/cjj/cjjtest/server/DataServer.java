package com.chuangwai.cjj.cjjtest.server;

import com.chuangwai.cjj.cjjtest.servlet.MathServlet;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by xingshi on 15/5/14.
 */
public class DataServer {
    public static void start(){
        Server server = new Server();
        SelectChannelConnector connector = new SelectChannelConnector();
        connector.setPort(10022);
        server.setConnectors(new Connector[]{connector});
        
        ServletContextHandler ctx = new ServletContextHandler(ServletContextHandler.SESSIONS);
        ctx.setContextPath("/");
        ctx.addServlet(new ServletHolder(new MathServlet()), "/math");
        server.setHandler(ctx);
        try{
            server.start();
            server.join();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
