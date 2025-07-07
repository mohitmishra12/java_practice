import servlett.HttpServlet;

class myservlet extends HttpServlet {

    private Object req;
    private ServletResponse res;

    public void init(){
        System.out.println("Servlet Initialized");

    }
    public <ServletRequest> void service(ServletRequest req, ServletResponse res){

        this.req = req;
        this.res = res;
    }

    public void destroy() {
        System.out.println("Servlet Destroyed");
    }

}


//Servelt practice

public class ServletJava {

}
