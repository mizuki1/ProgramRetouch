package ec;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
//
//		try {
//);
//
//			BuyDataBeans bdb = new BuyDataBeans();
//			bdb.setDeliveryMethodName(deliveryMethodName);
//			bdb.setBuyDate(formatDate);
//			bdb.setTotalPrice(totalPrice);
//
//		BuyDataBeans resultBDB = BuyDAO.getBuyDataBeansByBuyId(buyId);
//		request.setAttribute("resultBDB", resultBDB);
//
//				ArrayList<ItemDataBeans> buyIDBList = BuyDetailDAO.getItemDataBeansListByBuyId(buyId);
//		request.setAttribute("buyIDBList", buyIDBList);
//
//		} catch (SQLException e) {
//		e.printStackTrace();
//		}
	}
}
