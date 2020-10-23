package calculatrice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calcul
 */
@WebServlet("/Calcul")
public class Calcul extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calcul() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String op1,op2,op,msg=null;
		float z = 0;
		
		op1 = request.getParameter("op1");
		op2 = request.getParameter("op2");
		op = request.getParameter("op");
		
		int op11,op22;
		if(op1.equals("") || op2.equals("") ) {
			msg = "Champ vide !";
		}
		
		else {
		try {
			op11 = Integer.parseInt(op1);
			op22 = Integer.parseInt(op2);
			
			switch(op) {
			case "+" : z = op11 + op22 ; break;
			case "-" : z = op11 - op22 ; break;
			case "/" : if(op22 == 0 ) {
				msg =" division par 0 !";
			}else {
				z = (float)op11/op22;break;
			}
			case "*" : z = op11 * op22;break;
			
			}
			
			
		
			
			
		} catch (Exception e) {
			
			msg = "format invalide !";
		
				request.setAttribute("msg", msg);
				getServletContext().getRequestDispatcher("/saisie.jsp").forward(request, response);
				
		
			
		}
		
		}
		
		if(msg != null) {
			request.setAttribute("msg", msg);
			getServletContext().getRequestDispatcher("/saisie.jsp").forward(request, response);
			
	
			
		}else {
		
	
			request.setAttribute("res", z);
			getServletContext().getRequestDispatcher("/Affichage.jsp").forward(request, response);
			
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
