package ru.itis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 10.05.2017
 * UsersServlet
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersServlet extends HttpServlet {

    private List<User> users;

    @Override
    public void init() throws ServletException {
        super.init();
        User marsel = new User(1, "Marsel", 23, 185, "danger");
        User guzel = new User(2, "Guzel", 18, 178, "success");
        User sergey = new User(3, "Sergey", 17, 183, "info");

        users = new ArrayList<User>();
        users.add(marsel);
        users.add(guzel);
        users.add(sergey);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        PrintWriter writer = resp.getWriter();
        writer.write("<table>");
        for (int i = 0; i < users.size(); i++) {
            writer.write("<tr>");
            writer.write("<td>" + users.get(i).getId() + "</td>");
            writer.write("<td>" + users.get(i).getName() + "</td>");
            writer.write("<td>" + users.get(i).getAge() + "</td>");
            writer.write("<td>" + users.get(i).getHeight() + "</td>");
            writer.write("</tr>");
        }
        writer.write("</table>");
        */
        // кладем как атрибут запроса под названием "users" список юзеров
        req.setAttribute("users", users);
        // перенаправлем запрос на JSP-станицу
        req.getRequestDispatcher("/jsp/users.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        Integer age = Integer.parseInt(req.getParameter("age"));
        Integer height = Integer.parseInt(req.getParameter("height"));
        String style = req.getParameter("style");

        User user = new User(id, name, age, height, style);

        users.add(user);
    }

}
