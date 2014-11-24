package tuanpmpd01037.main;

import java.util.ArrayList;
import java.util.List;



import tuanpmpd01037.custom.xml.CustomTuVungActivity;
import tuanpmpd01037.duan1.R;
import tuanpmpd01037.object.ChuDe;
import tuanpmpd01037.object.TuVung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class TuVungActivity extends Activity {
	List<ChuDe> listChuDe = new ArrayList<ChuDe>();
	CustomTuVungActivity adapterChuDe;
	ListView mylist;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tu_vung);
		loadData() ;
		mylist=(ListView)findViewById(R.id.mylist);
		adapterChuDe = new CustomTuVungActivity(TuVungActivity.this, listChuDe);
		mylist.setAdapter(adapterChuDe);
		mylist.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				DetailTuVungActivity.listDetail.clear();
				DetailTuVungActivity.listDetail.add(listChuDe
						.get(position));
				Intent in = new Intent(TuVungActivity.this,
						DetailTuVungActivity.class);
				startActivity(in);
			}
		});
	}
	void loadData() {
		List<TuVung> list_34 = new ArrayList<TuVung>();
		list_34.add(new TuVung("Accustom to", "(v)", "quen biết", "Chef must accustom thememselves to working long hours", "Những bếp trưởng phải tự làm quen với việc làm việc nhiều giờ đồng hồ"));
		list_34.add(new TuVung("Apprentice", "(n)", "người học nghề,tập sự", "Instead of attending cooking course,Raul chose to work as an apprentice with an experienced chef", "Thay vì tham gia lớp học nấu ăn,Raul đã chọn làm việc như một thực tập sinh với các bếp trưởng có kinh nghiệm"));
		list_34.add(new TuVung("Culinary", "(adj)", "nấu nướng,bếp núc", "The chef was widely known for his culinary artistry ", "Bếp trưởng nổi tiếng về nghệ thuật nấu nướng của anh ta"));
		list_34.add(new TuVung("Demanding", "(adj)", "đòi hỏi khắt khe", "Theodore was exhausted by his demanding job in the restaurant.", "Theodore quá mệt mỏi bởi yêu cầu công việc khắt khe tại nhà hàng"));
		list_34.add(new TuVung("Draw", "(v)", "lôi kéo,thu hút", "we hope the new restaurant will draw other business to the area ", "Chúng tôi hy vọng nhà hàng mới sẽ thu hút nhiều doanh nghiệp tới vùng"));
		list_34.add(new TuVung("Incorporate", "(v)", "kết hợp", "Many of your suggestion have been incorporated in the plan", "Trong kế hoạch này,nhiều ý tưởng được kết hợp với nhau"));
		list_34.add(new TuVung("Influx", "(n)", "dòng(người)", "An influx of new chefs is constantly needed to fill open jobs", "Không ít vị trí bếp trưởng liên tục cần đươc tuyển để thay thế vị trí còn trống"));
		list_34.add(new TuVung("Method", "(n)", "phương pháp,cách thức", "Gloria perfected a simple method for making croissants", "Gloria đã hoàn thiện phương pháp đơn giản để làm bánh sừng bò"));
		list_34.add(new TuVung("Outlet", "(n)", "chỗ thoát,lối ra,của hàng", "The business has 34 retail outlets in this state alone", "Doanh nghiệp này có đến 34 cửa hàng bán lẻ chỉ riêng ở ban này"));
		list_34.add(new TuVung("Profession", "(n)", "nghề nghiệp", "He was an electrician by profession", "Xét về nghề nghiệp,anh ta là một thợ điện"));
		list_34.add(new TuVung("Relinquish", "(v)", "bỏ,từ bỏ", "People find it hard to relinquish their accustomed food preferences and try something new", "Mọi người nhận thấy thật khó để từ bỏ những thực phẩm quen thuộc và thử một món mới"));
		list_34.add(new TuVung("Theme", "(n)", "đề tài,chủ đề", "The caterers prepared food for a party with a tropical island theme", "Người chủ khách sạn đã chuẩn bị những món ăn vùng nhiệt đới cho bữa tiệc"));
		list_34.add(new TuVung("Spice", "(n)", "gia vị", "The spice imparts an Eastern flavor to the dish", "Gia vị mang lại hương vị của lễ phục sinh cho các món ăn"));
		list_34.add(new TuVung("Chef", "(n)", "đầu bếp", "Try this new dish ,created by our head chef", "Hãy thử món ăn mới này,được nấu bởi bếp trưởng của chúng ta"));
		ChuDe cd_34 = new ChuDe();
		cd_34.setIdChude("Cooking as a career – Đầu bếp");
		cd_34.setImage(R.drawable.daubep);
		cd_34.setListTuVung(list_34);
		listChuDe.add(cd_34);
		// ========================================================
		List<TuVung> list_33 = new ArrayList<TuVung>();
		list_33.add(new TuVung("Burdensome", "(adj)", "nặng,gánh nặng", "The secretary found her tedious asignments burdensome ", "Cô thư ký nhận thấy những nhiệm vụ tẻ ngắt của mình là một gánh nặng"));
		list_33.add(new TuVung("Common", "(adj)", "thông thường,phổ biến", "It is common for the office manager to be designated to order lunch for business meeting ", "Thông thường người quản lý được giao nhiệm vụ đặt bữa trưa cho các hội nghị doanh nghiệp"));
		list_33.add(new TuVung("Delivery", "(n)", "giao hàng,phân phối", "The restaurant is reluctant to make an exception for our office ", "Nhà hàng không sẵn lòng giao đồ ăn nhưng họ ngoại lệ cho văn phòng chúng tôi"));
		list_33.add(new TuVung("Elegant", "(adj)", "tinh tế,tao nhã", "It's important that the meal be elegant", "Quan trọng là bữa cơm trông phải tinh tế"));
		list_33.add(new TuVung("Fall to", "(v)", "trách nhiệm được giao cho", "The task of prepareing the meal fell to the assitant chef when the chief chef was ill", "Nhiệm vụ chuẩn bị các bữa ăn được giao cho bếp phó khi bếp trưởng ốm"));
		list_33.add(new TuVung("Impress", "(v)", "gây ấn tượng", "I was impressd with how quickly they delivered our lunch", "Tôi ấn tượng khi họ chuyển bữa trưa tới nhanh đến vậy"));
		list_33.add(new TuVung("Individual", "(n/adj)", "cá nhân,riêng ,lẽ", "We had the delivery man mark the contents of each individual order ", "Chúng tôi có người giao hàng đánh dấu nội dung mỗi đơn hàng cá nhân"));
		list_33.add(new TuVung("List", "(n/v)", "danh sách,lên danh sách", "The office manager compiled a list of everyone's order ", "Quản lý văn phòng soạn thảo một danh sách những người đặt hàng"));
		list_33.add(new TuVung("Multiple", "(adj)", "phức tạp,nhiều", "The delivery person was not able to keep track of the multiple order .causing a food mix-up", "Người giao hàng không thể nhớ hết trật tự phức tạp của hàng hoá,dẫn đến tình trạng nhầm lẫn thực phẩm"));
		list_33.add(new TuVung("Narrow", "(v/adj)", "thu hẹp", "Etseko narrowed the restaurant possibilities down to three ", "Etseko thu hẹp số nhà hàng xuống còn 3 nhà hàng"));
		list_33.add(new TuVung("Pick up", "(v)", " đón ai đó", "The bus picks up pasengers outside the airport ", "Chiếc xe buýt đón khách bên ngoài sân bay"));
		list_33.add(new TuVung("Settle", "(v)", "thanh toán", "We settled the bill with the cashier ", "Chúng thanh toán hoá đơn với thu ngân"));
		list_33.add(new TuVung("Order", "(v/n)", "gọi món,đặt món", "Ordering food at a restaurant can be difficult.Menus can be confusing ,you may have difficult choosing between many dishes ", "Đặt đồ ăn tại nhà hàng có thể không dễ.Thực đơn có thể gây bối rối cho bạn,có quá nhiều món để lựa chọn"));
		list_33.add(new TuVung("Bill", "(n)", "hoá đơn", "We had an argument with the waiter about the bill", "Chúng tôi đã cãi vã với người bồi bàn về hoá đơn thanh toán"));
		ChuDe cd_33 = new ChuDe();
		cd_33.setIdChude("Ordering lunch – Đặt bữa trưa");
		cd_33.setImage(R.drawable.buatrua);
		cd_33.setListTuVung(list_33);
		listChuDe.add(cd_33);
		//=============================================================
		List<TuVung> list_32 = new ArrayList<TuVung>();
		list_32.add(new TuVung("Taste ","(n/v)","khẩu vị,nếm","Black coffee leaves a bitter taste in the mouth","Cà phê đen để lại một chút vị đắng trong miệng	"));
		list_32.add(new TuVung("Recommend","(v)","giới thiệu","Can you recommend me a good English dictionary","Anh có thể giới thiệu cho tôi cuốn từ điển Anh ngữ tốt nhất	"));
		list_32.add(new TuVung("Basic ","(adj)","cơ bản","The new restaurant offers a very basic menu","Nhà hàng mới phục vụ những món ăn rất cơ bản	"));
		list_32.add(new TuVung("Complete","(adj/v)","hoàn hảo,hoàn thành","The new restaurant offers a complete menu of appetizers,entrees,and desserts","Nhà hàng mới phục vụ 1 thực đơn các món ăn ,món khai vị và món rau tráng miệng hoàn hảo	"));
		list_32.add(new TuVung("Excite ","(v)","háo hức","Exotic flavors always excite me","Những hương vị mới lạ luôn khiến tôi phấn khích	"));
		list_32.add(new TuVung("Flavour","(n/v)","mùi vị,hương vị","The cook changed the flavour of the soup with a unique blend of herbs ","Đầu bếp thay đổi hương vị của món canh bằng sự pha trộn độc đáo của các loại thảo mộc	"));
		list_32.add(new TuVung("Forget ","(v)","quên","Don't forget to tel your friends what a great meal you had tonight","Đừng quên kể với các bạn của bạn  rằng bạn đã có 1 bữa ăn thật ngon tối nay	"));
		list_32.add(new TuVung("Ingredient","(n/v)","nguyên liệu,thành phần","The chef went to the farmer's market to select the freshest ingredients for tonight's menu","Vị đầu bếp đi tới chợ của nông dân để chọn các nguyên liệu tươi nhất cho thực đơn tối nay	"));
		list_32.add(new TuVung("Judge","(v)","đánh giá,phán xét","Hector was not familiar with Asian cooking ,so he was unable to judge if the noodles were cooked correctly ","Hector không quen thuộc với cách nấu ăn của người Châu Á do đó anh ấy không thể đánh giá được mì có được nấu đúng cách hay không	"));
		list_32.add(new TuVung("Mix up ","(v)","làm lộn xộn,trộn","The amateur chef mixed up the ingredients and ruined the dish ","Anh đầu bếp nghiêp dư trộn các nguyên liệu với nhau và làm hỏng món ăn	"));
		list_32.add(new TuVung("Patron","(n)","khách hàng quen","Once the word was out about the new chef,patrons lined up to get in to the restaurant","Khi tin tức về đầu bếp mới được loan ra,các khách hàng quen đã xếp hàng để tới nhà hàng	"));
		list_32.add(new TuVung("Predict","(v)","dự đoán,đoán","I predicted this restaurant would become popular and I was right","Tôi đo đoán rằng nhà hàng này sẽ trở nên nổi tiếng và tôi đã đúng	"));
		list_32.add(new TuVung("Random","(adj)","ngẫu nhiên","We made random selections from the menu","Chúng tôi chọn ngẫu nhiên trong thực đơn	"));
		list_32.add(new TuVung("Remind","(v)","nhắc nhở,làm nhớ lại","Ms.Smith was annoyed at having to remind the waitress to bring the check","Cô Smith khó chịu khi phải nhắc nhở phục vụ mang tờ sec tới	"));		ChuDe cd_32 = new ChuDe();
		cd_32.setIdChude("Eating out – Ăn ngoài");
		cd_32.setImage(R.drawable.anngoai);
		cd_32.setListTuVung(list_32);
		listChuDe.add(cd_32);
		//=============================================================
		List<TuVung> list_31 = new ArrayList<TuVung>();
		list_31.add(new TuVung("Select","(v)", "lựa chọn", "Always select the right tool for the job", "Hãy luôn chọn công cụ thích hợp cho công việc"));
		list_31.add(new TuVung("Restaurant ", "(n)", "	nhà hàng", "There are good cafes and a restaurant close at hand", "Có những quán cà phê và một nhà hàng ngon nằm gần nhau"));
		list_31.add(new TuVung("Appeal","(adj)", "thu hút,hấp dẫn", "The colorful vegetable made the dish look appealing", "Rau nhiều màu sắc khiến món ăn trông thật hấp dẫn"));
		list_31.add(new TuVung("Arrive","(v)", "đến,tới nơi", "By the time our meal arived ,it was cold", "Lúc mà đồ ăn đến thì nó đã nguội rồi"));
		list_31.add(new TuVung("Compromise","(n)", "thoả thuận,dàn xếp", "The couple made a compromise and ordered food for take out", "Cặp đôi thoả thuận với nhà hàng và đặt thức ăn để mang đi"));
		list_31.add(new TuVung("Daring ","(adj	)", "táo bạo,cả gan", "Kobi had more daring tastes than the rest of hic family", "Kobi có sở thích táo bạo hơn các thành viên còn lại trong gia đình"));
		list_31.add(new TuVung("Familiar", "(adj)", "quen thuộc", "It's nice to see some familiar items on the menu", "Thật vui khi thấy những món quen thuộc trên tờ thực đơn"));
		list_31.add(new TuVung("Guide", "(n/v)", "hướng dẫn viên,chỉ đường", "The guide led our tour group to small restaurant only known to the locals", "Hãy dẫn viên dẫn đoàn chúng tôi tới một nhà hàng nhỏ mà chỉ có dân địa phương mới biết"));
		list_31.add(new TuVung("Majority", "(n)", "	phần đông", "The majority of the group wanted to try the new Chinese restaurant ", "Đa số đoàn muốn thử nhà hàng món ăn Trung Quốc mới"));
		list_31.add(new TuVung("Mix	", "(n/v)", "pha trộn", "The daring chef mixed two uncommon ingredients", "Vị đầu bếp táo bạo trộn 2 thành phần không phổ biến vào với nhau"));
		list_31.add(new TuVung("Rely", "(v)", "tin cậy,dựa vào", "I seldom rely on the restaurant reviews in the paper when chosing a restaurant ", "Tôi hiếm khi tin vào những nhận xét về các nhà hàng ở trên báo khi chọn 1 nhà hàng"));
		list_31.add(new TuVung("Secure", "(v)", "chiếm được", "Despite the popularity of the restaurant ,Max was able to secure reservations for this evening", "Dù nhà hàng  rất đông,Max vẫn có thể kiếm được bàn đặt cho tối nay"));
		list_31.add(new TuVung("Subjective", "(adj)","chủ quan", "Food  preferences  are subjective and not everyone agrees on what taste good", "Các ý kiến về đồ ăn đều là ý kiến chủ quan và không phải tất cả mọi người đều thống nhất mùi vị  nào ngon"));
		list_31.add(new TuVung("Suggest	","(v)","gợi ý,đề nghị", "I suggest you think about the specials,since they are very good today", "Tôi đoán là anh đang nghĩ về các món đặc biệt,vì hôm nay chúng rất ngon"));		ChuDe cd_31 = new ChuDe();
		cd_31.setIdChude("Selecting a restaurant – Chọn nhà hàng");
		cd_31.setImage(R.drawable.nhahang);
		cd_31.setListTuVung(list_31);
		listChuDe.add(cd_31);
		//=============================================================
				List<TuVung> list_30 = new ArrayList<TuVung>();
				list_30.add(new TuVung("Rent","(n/v)","sự thuê,cho thuê","You cannot stay here ad infinitum without paying rent.","Bạn không thể ở đây quảng cáo vô cùng tận mà không trả tiền thuê nhà"));
				list_30.add(new TuVung("Lease","(v/n)","thuê,cho thuê","They decided to lease the property rather than buy it","Họ đã quyết định thuê thay vì mua bất động sản đó"));
				list_30.add(new TuVung("Apprehensive","(adj)","lo lắng,nhận thức","Most new home buyer are apprehensive about their decision","Hầu hết mọi người mua nhà mới đều lo lắng về quyết định của mình"));
				list_30.add(new TuVung("Circumstance ","(n)","tình huống ,hoàn cảnh","Under the current economic circumstance,they will not be able to purchase the property","Với hoàn cảnh kinh tế hiện nay họ sẽ không thể mua bất động sản đó được"));
				list_30.add(new TuVung("Condition","(n)","điều kiện","Except for some minor repairs,the building is in very good condition","Ngoài vài sữa chữa nhỏ thì toà nhà vẫn ở trong tình trạng rất tốt"));
				list_30.add(new TuVung("Due to","(prep)","do,bởi vì","Due to the low interest rates,good office space is difficult to find","Do mức lãi suất thấp nên không gian văn phòng tốt rất khó kiếm"));
				list_30.add(new TuVung("Fluctuate","(v/n)","biến động","No one is very comfortable making a large investment while the currentcy values fluctuate almost daily","Không ai có thể thoải mái đầu tư 1 khoản lớn trong khi giá tiền tệ biến động hầu như hàng ngày"));
				list_30.add(new TuVung("Get out of","(v/n)","tránh khỏi","The agent was not sure if the executives could get out ò their prior real estate arrangement","Các đại lý không chắc chắn giám đốc điều hành có thể tránh khỏi cuộc dàn xếp bất động sản của họ không"));
				list_30.add(new TuVung("Indicator ","(n)","người,vật chỉ thị","If the economy is an accurate indicator,rental prices will increase rapidly in the next six months","Nếu nền kinh tế là một chỉ số chính xác thì giá thuê sẽ tăng mạnh trong 6 tháng tới"));
				list_30.add(new TuVung("Real estate ","(n)","bất động sản","Real estate is a piece of land including the air above it and the ground below it,and any buildings or structures on it","Bất động sản là một mảnh đất,bao gồm không gian phía trên nó và mặt đất phía dưới,và các toà nhà,công trình phía trên"));
				list_30.add(new TuVung("Look into","(v)","cam kết","The company locked itself into a ten years lease that they didn't want ","Công ty cam kết thuê 10 năm mặc dù họ không muốn"));
				list_30.add(new TuVung("Occupancy","(n)","chiếm giữ","The occupancy rate in the building has never fallen below 85percent","Tỷ lệ sử dụng không gian trong toà nhà chưa bao giờ xuống dưới 85%"));
				list_30.add(new TuVung("Option","(n)","sự lựa chọn","You could arange the lease with an option to buy after a certain amount of time","Bạn có thể soạn hợp đồng cho thuê với lựa chọn mua sau 1 khoảng thời gian nào đó"));
				list_30.add(new TuVung("Subject to","(adj)","tuỳ thuộc vào","This contract is subject to all the laws and regulations of the state","Hợp đồng này phải theo đúng luật và quy định của nhà nước "));
				ChuDe cd_30 = new ChuDe();
				cd_30.setIdChude("Renting and releasing – Thuê và cho thuê văn phòng");
				cd_30.setImage(R.drawable.thue);
				cd_30.setListTuVung(list_31);
				listChuDe.add(cd_30);
				//=========================================================
				List<TuVung> list_29 = new ArrayList<TuVung>();
				list_29.add(new TuVung("Shoe","(n)","Giày","He always wears a red pair of shoes when he goes to shool","Anh ta luôn mang một đôi giày đỏ đi học"));
				list_29.add(new TuVung("Scarf","(n)","Khăn quàng cổ","Women also wear scarves over their shoulders or hair","Phụ nữ thường quàng khăn lên vai hoặc tóc của họ"));
				list_29.add(new TuVung("Comfortable","(adj)","dễ chịu,thoải mái","These new shoes are not very comfortable","Những chiếc giày mới này chả dễ chịu tí nào"));
				list_29.add(new TuVung("Pocket","(n)","túi","I put the pen in my pocket","Tôi để cái bút  trong túi"));
				list_29.add(new TuVung("Second-hand","(adj)","cũ,đã dùng rồi","I bought it in a second-hand bookshop","Tôi mua nó ở hiệu sách cũ"));
				list_29.add(new TuVung("Paint","(n)","quần tây","He wants to find a new pair of pants","Anh ấy muốn tìm mua một đôi quần mới"));
				list_29.add(new TuVung("Expensive","(adj)","đắt tiền","I can't afford it.it's too expensive","Tôi không thể mua được vì nó quá đắt"));
				list_29.add(new TuVung("Wear","(v)","mang,đeo,mặc","Was she wearing a seat belt?","Cô ấy đang thắt dây an toàn phải không?"));
				list_29.add(new TuVung("Ring","(n)","nhẫn,đai,vòng","My mother wears a gold ring on her finger","Mẹ tôi đeo một chiếc nhẫn trên ngón tay"));
				list_29.add(new TuVung("Tight","(adj)","chật,khít","She twisted her hair into a tight knot","Cô xoắn tóc cô vào môt cái nút chặt chẽ"));
				list_29.add(new TuVung("Sock","(n)","tất,vớ","He has bought a pair of socks","Anh ta mới mua một đôi tất"));
				list_29.add(new TuVung("Boot","(n)","Ủng,giày cao cổ","She always likes a pair of black leather boots","Cô ấy luôn thích một đôi giày cao cổ bằng da màu đen"));
				list_29.add(new TuVung("Button","(n)","cái nút,khuy áo","I picked up a shirt buttons on the way to school","Trên đường đi học,tôi nhặt được một cái cúc"));
				list_29.add(new TuVung("Sew","(v)","may,khâu","My mother taught me how to sew","Mẹ tôi dạy tôi cách khâu vá"));
				ChuDe cd_29 = new ChuDe();
				cd_29.setIdChude("Clothing – Quần áo");
				cd_29.setImage(R.drawable.quanao);
				cd_29.setListTuVung(list_29);
				listChuDe.add(cd_29);
				//================================================
				List<TuVung> list_28 = new ArrayList<TuVung>();
				list_28.add(new TuVung("Win ","(v)","chiến thắng","If we win this game we will be the semifinal champions","Nếu chúng ta thắng trận này chúng ta sẽ vào bán kết"));
				list_28.add(new TuVung("Finish","(v/n)","Kết thúc","The cyclist was too tired to make it to the finish line","Vận động viên đua xe đạp quá mệt để cán đích"));
				list_28.add(new TuVung("Fast","(v)","nhanh","The swimmer was so fast that he finished the race in record time","Vận động viên bơi lội đã nhanh đến mức đạt đích ở mức kỷ lục"));
				list_28.add(new TuVung("Cheer","(v)","cổ vũ","The crowd cheered when the home team got the last goal","Khán giả đã reo hò khi đội nhà giành được bàn thắng cuối cùng"));
				ChuDe cd_28 = new ChuDe();
				cd_28.setIdChude("Sports – Thể thao");
				cd_28.setImage(R.drawable.thethao);
				cd_28.setListTuVung(list_28);
				listChuDe.add(cd_28);
	}
}
