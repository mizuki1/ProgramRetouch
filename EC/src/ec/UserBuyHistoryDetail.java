package ec;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.BuyDataBeans;
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

		request.getRequestDispatcher(EcHelper.USER_BUY_HISTORY_DETAIL_PAGE).forward(request, response);

		HttpSession session = request.getSession();
 try {
		int userId = (int) session.getAttribute("userId");
		//int buyId = (int)session.getAttribute("buyId");

			ArrayList<BuyDataBeans> UserData = BuyDetailDAO.getBuyDataBeansListByBuyUserId(userId);
			request.setAttribute("userData", UserData);

			//ArrayList<ItemDataBeans> UserbuyHi = BuyDetailDAO.getItemDataBeansListByBuyId(buyId);
			//request.setAttribute("userbuyHi", UserbuyHi);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
