
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import services.AccountService;

/**
 *
 * @author 813116
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        if (request.getParameterMap().containsKey("logout")) {
            session.invalidate();
            request.setAttribute("message", "You have successfully logged out");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
 

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String username = request.getParameter("usersname");
        String password = request.getParameter("password");
        
        if (username != null &&  password != null) {
        AccountService as = new AccountService();
        User user = as.login(username, password);
        
        
            if (user == null) {
                request.setAttribute ("message", "please enter the username");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            } else{
                session.setAttribute("username", username);
                response.sendRedirect("home");   
            }
        }  
        
        
        
    }

}
