package com.edgar.vertx.web.handler;

import com.edgar.vertx.web.util.Runner;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.FileUpload;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;

import java.util.Set;

/**
 * Created by Administrator on 2015/9/6.
 */
public class BodyHandleServer extends AbstractVerticle {

    public static void main(String[] args) {
        Runner.runExample(BodyHandleServer.class);
    }

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);
        Route route = router.route().handler(BodyHandler.create());
        router.post("/some/path").handler(routingContext -> {
            //Getting the request body
            routingContext.getBody();
            routingContext.getBodyAsJson();
            routingContext.getBodyAsString();

        });
        //Limiting body size
//        BodyHandler.create().setBodyLimit(1000);

        //Merging form attributes
        //By default, the body handler will merge any form attributes into the request parameters
//        BodyHandler.create().setMergeFormAttributes(false);

        //Handling file uploads
        //If a body handler is on a matching route for the request, any file uploads will be automatically streamed to the uploads directory, which is file-uploads by default.
        //Each file will be given an automatically generated file name, and the file uploads will be available on the routing context with fileUploads.
        router.post("/some/path/uploads").handler(routingContext -> {
            Set<FileUpload> uploads = routingContext.fileUploads();
            // Do something with uploads....
        });

        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
}