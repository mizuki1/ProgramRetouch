package ec;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.ItemDataBeans;
import dao.BuyDetailDAO;

/**
 * 購入履歴画面
 * @author d-yamaguchi
 *
 */
@WebServlet("/UserBuyHistoryDetail")
public class UserBuyHistoryDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		HttpSession session = request.getSession();

	try {

		String buyid = request.getParameter("buy_id");
		int num = Integer.parseInt(buyid);
		request.setAttribute("num", num);

		BuyDetailDAO buydetailDAO = new BuyDetailDAO();
		ArrayList<ItemDataBeans> buyID  = buydetailDAO.getItemDataBeansListByBuyId(num);
	    request.setAttribute("buyID", buyID);


//	    ArrayList<BuyDataBeans> UserData = BuyDetailDAO.getBuyDataBeansListBuyId(num);
//	   	request.setAttribute("userData", UserData);

	    request.getRequestDispatcher(EcHelper.USER_BUY_HISTORY_DETAIL_PAGE).forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
