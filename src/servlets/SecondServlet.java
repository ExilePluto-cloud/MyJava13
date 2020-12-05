package servlets;

import com.demo.Student;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=gb2312");

        PrintWriter out=response.getWriter();

        ServletContext context=this.getServletContext();
        Student stu2=(Student)context.getAttribute("stu");
        String name=stu2.getName();
        String sno=stu2.getSno();

        out.println("<html><body>");
        out.println("姓名"+name+"<br>");
        out.println("学号"+sno+"<br>");
        out.println("<a href='input.html'>aaa</a>");
        out.println("</body></html>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
