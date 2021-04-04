import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import  java.util.Scanner;

public class login extends HttpServlet {
    /*String bankUsername1 = "";
    String bankUserpwd1 = "";
    String companyUsername1 = "";
    String companyKeystore1 = "";

    public boolean bankLogin(String username, String password){
        if (username == bankUsername1 && password == bankUserpwd1){
            return true;
        }else{
            System.out.println("The username or password is not correct.");
            return false;
        }
    }

    public boolean companyLogin(String username, String keystore){
        if (username == companyUsername1 && keystore == companyKeystore1){
            return true;
        }else{
            System.out.println("The username or password is not correct.");
            return false;
        }
    }*/

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String encode = req.getServletContext().getInitParameter("encode");
        req.setCharacterEncoding(encode);
        resp.setContentType("text/html;charset="+encode);
        try {
            String username = req.getParameter("username");
            String userpwd = req.getParameter("password");
            System.out.println("用户名：" + username);
            System.out.println("密码：" + userpwd);

            /*
            //下边就是加载数据库的过程
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql:///day02";
            String user = "root";
            String password = "xxxxxxx";
            String sql = "select * from users where userName = '"+name+"'";
            String sql2 = "select * from users where password = '"+pwd+"'";
            Connection conn = DriverManager.getConnection(url, user, password);
            //这里我选择是创建了两个执行器，如果一个执行器执行两个sql语句。就会出现异常

            Statement stmt = conn.createStatement();
            Statement stmt2 =conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet rs2 = stmt2.executeQuery(sql2);
            if (rs.next()){
                System.out.print("用户名：" + rs.getString("userName") + "\t");
            }else{
                resp.getWriter().write("对不起你帐号名有误，请<a href='/day02'>注册</a>");
            }
            //通过了帐号的判断，就对密码进行判断，同样是判断密码是否与数据库中的密码匹配
            if(rs2.next()){
                resp.getWriter().write("登录成功，点击跳转<a href='http://www.baidu.com'>首页</a>");
                System.out.print("密码：" + rs.getString("password") + "\t");
            }else{
                resp.getWriter().write("对不起你密码有误，请<a href='/day02'>注册</a>");
            }
        }catch (Exception e){
            e.printStackTrace();
        }*/
        }catch (Exception e){

        }
    }
}
