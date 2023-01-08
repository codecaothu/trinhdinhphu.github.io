# trinhdinhphu.github.io
1. GIT là gì?
Git là một hệ thống quản lý phiên bản phân tán (có tên tiếng anh là Distributed Version Control System – DVCS) được ra đời vào năm 2005 hiện đang được sử dụng vô cùng phổ biến. 
Git cung cấp cho mỗi một lập trình viên kho lưu trữ riêng cho toàn bộ lịch sử thay đổi.

2. Git hoạt động như thế nào?
2.1 Quản lý phiên bản
Giống như các VCS khác, Git hoạt động bằng cách ghi nhận lại mọi thay đổi trong hệ thống file theo thời gian. Sự khác biệt của Git là mỗi khi một thay đổi được người dùng commit (xác nhận), Git sẽ chụp lại trạng thái của toàn bộ hệ thống file tại thời điểm đó (snapshot), nghĩa là lưu lại phiên bản đã thay đổi của các file.
2.2 Luồng công việc phân tán
Ngược lại với hệ thống kiểm soát phiên bản tập trung (CVCS), bản chất phân tán của Git cho phép bạn linh hoạt hơn nhiều trong cách các nhà phát triển cộng tác trong các dự án. Trong các hệ thống tập trung, mỗi nhà phát triển là một nút hoạt động ngang bằng với với trung tâm. 

3. Git đem lại lợi ích gì?
3.1 Khả năng phân nhánh (branch)
Một trong những ưu điểm lớn nhất của Git là khả năng phân nhánh của nó. Không giống như các hệ thống kiểm soát phiên bản tập trung, các branch trong Git rất dễ tạo và dễ hợp nhất.
3.2 Khả năng phát triển phân tán
Git là một hệ thống kiểm soát phiên bản phân tán, mỗi developer có thể có kho lưu trữ cục bộ của riêng họ, với đầy đủ lịch sử thay đổi. Do đó các thành viên có thể làm việc độc lập với nhau và sau đó hợp nhất khi mọi thứ hoàn chỉnh, không cần duy trì kết nối liên tục đến nhánh gốc.
3.3 Cộng đồng tích cực, nhân lực dồi dào
Là hệ thống quản lý phiên bản nguồn mở phổ biến bậc nhất, Git có một cộng đồng đông đảo và luôn sẵn sàng hỗ trợ. Nếu dự án của bạn đang sử dụng Git, khả năng cao bạn sẽ không phải đào tạo nhân viên mới về quy trình làm việc của mình, vì họ đã quen với phát triển phân tán trên git.
3.4 Chu kỳ phát triển nhanh hơn
Kết quả cuối cùng của các ưu điểm trên chu kỳ phát triển nhanh hơn cho dự án của bạn, giúp tiết kiệm chi phí và sản phẩm cuối cùng cũng tốt hơn.

4. Một số khái niệm cơ bản trong GIT:
- Repository: Repository là nơi quản lý, lưu trữ tất cả mọi thông tin cần thiết cũng như các sửa đổi và lịch sử sửa đổi của toàn bộ dự án. Hiện nay, có hai loại repository đó là local repository và remote repository. 
- Snapshot: Cơ chế lưu trữ các phiên bản của Git là sau mỗi lần bạn thực hiện lưu trạng thái đều sẽ tạo ra một ảnh chụp có lưu lại tất cả nội dung của tập tin và thư mục tại thời điểm đó rồi tham chiếu tới snapshot. Nếu như tập tin không có thay đổi để hiệu quả hơn thì Git sẽ không lưu trữ tập tin đó lại mà chỉ tạo ra liên kết với tập tin gốc đã được tồn tại trước đó. Sau đó, khi cần thì bạn có thể khôi phục và sử dụng lại một snapshot là được. Đây cũng là lợi thế khi lưu dưới dạng snapshot sẽ giúp Git tiết kiệm không gian lưu trữ vô cùng hiệu quả. 
- Commit: Commit là thao tác báo cho hệ thống biết bạn có muốn lưu lại trạng thái hiện hành hay không rồi ghi nhận lại lịch sử các xử lý đã thực hiện như: xóa, cập nhật, thêm các file hoặc thư mục nào đó trên repository.
- Clone: Nếu như bạn cần có một bản sao của kho chứa Git có sẵn, có thể là dự án mà bạn tham gia thì chỉ cần thực hiện Clone. Đây chỉnh là điểm giúp Git khác biệt hơn so với một số hệ thống quản lý phiên bản mã nguồn khác. Bởi vì, Clone là tạo ra một bản sao của gần như tất cả những gì của repository mà máy chủ đang lưu trữ. Bạn sẽ có được tất cả lịch sử đã xảy ra trên hệ thống và có thể quay lại, undo lại bất kỳ thời điểm commit nào một cách dễ dàng. 
- Push: Lệnh Push thường được sử dụng để đưa nội dung kho lưu trữ cục bộ lên server và nó cũng là cách bạn chuyển giao các commit từ kho lưu trữ cục bộ lên server. 
- Fetch: Lệnh này sẽ cho phép truy cập vào Repository trên server và kéo toàn bộ dữ liệu mà bạn chưa có được từ Repository trên server về.

