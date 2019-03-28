package ice.springmvc.controller;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ice
 * @date 18-12-10 上午11:08
 */
public class HttpRequestHandlerTest implements HttpRequestHandler {
    /**
     * Process the given request, generating a response.
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @throws ServletException in case of general errors
     * @throws IOException      in case of I/O errors
     */
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println(this.getClass() + " run");
    }
}
