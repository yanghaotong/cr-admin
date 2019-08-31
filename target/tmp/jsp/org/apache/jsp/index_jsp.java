package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>汽车维修管理系统</title>\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/themes/login.css\">\r\n");
      out.write("<!-- Javascript -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery-1.11.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t<div class=\"denglu\">\r\n");
      out.write("\t\t\t\t<div class=\"shurukuang\">\r\n");
      out.write("\t\t\t\t\t<div width=\"320\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 200px; margin-left: 70px;\">\r\n");
      out.write("\t\t\t\t\t\t<div height=\"28\" style=\"margin-top: 210px;\">\r\n");
      out.write("\t\t\t\t\t\t\t用户名：<input name=\"loginName\" type=\"text\" class=\"shuru01\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"loginName\" value=\"\"></input>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div height=\"28\">\r\n");
      out.write("\t\t\t\t\t\t\t密码：<input type=\"password\" name=\"password\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"shuru02\" id=\"password\" value=\"\"></input>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div height=\"28\" align=\"left\" style=\"margin-top: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"queding\"  id=\"login\">登录</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"padding-right:8px;height:40;margin-top: 60px;\"\r\n");
      out.write("\t\t\t\t\t\t\talign=\"right\">版本号：V1.0.01</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"");
      out.print(path);
      out.write("/js/index/login.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar path ='");
      out.print(path);
      out.write("';\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
