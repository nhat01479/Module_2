package org.demo;

import static org.junit.Assert.assertEquals;

public class Main {
      /*
         TDD - Test Driven Development - Phát triển hướng kiểm thử

-   Là một phương pháp cải tiến cho các nhà phát triển phầm mềm chuyên nghiệp, giúp nâng cao năng suất và hiệu quả phầm mềm

-    TDD bao gồm sự kết hợp của hai thành tố:

      + TFD - Test-First Development: viết kiểm thử trước khi viết code

      + Refactoring: sửa code sau khi kiểm thử

-   Mã tốt nghĩa là:

    + Vượt qua tất cả các kiểm thử
    + Không có mã lặp
    + Rõ ý
    + Không có mã không phục vụ ba mục tiêu trên

********************************************

Kiểm thử phần mềm (Software Testing)

-   Là quá trình thực thi 1 chương trình với mục đích tìm ra lỗi.
Quá trình này đảm bảo sản phẩm phần mềm đáp ứng chính xác, đầy đủ và đúng theo yêu cầu đưa ra.

-   2 phương pháp kiểm thử:

  + Kiểm thử thủ công (Manual Testing)

  + Kiểm thử tự động (Automated Testing)

Sau khi xây dựng xong một hàm hoặc một chức năng cụ thể nào đó ==> cần kiểm tra lại tính đúng đắn của những gì đã viết. Có 2 cách để làm việc này:

1. Kiểm tra thủ công bằng cách chạy lại hàm hoặc chức năng vừa viết ==> quan sát kết quả để đánh giá

2. Kiểm tra tự động bằng cách xây dựng sẵn một kịch bản thực thi cho hàm, hoặc chức năng ==> chạy mã và xem kết quả để đánh giá

****************************************************************************

  KIỂM THỬ TỰ ĐỘNG - Automated Testing

Là quá trình sử dụng những công cụ hỗ trợ để kiểm thử phần mềm. Đây là quá trình chạy lại các kịch bản kiểm thử đã được kiểm thử thủ công, lặp lại nhiều lần.

-   Tại sao phải kiểm thử tự động?

Kiểm thử tự động rất quan trọng vì những lý do sau:

    + Giúp tiết kiệm được thời gian và chi phí phát triển hơn so với kiểm thử thủ công

    + Giúp hạn chế các sai sót do thao tác thủ công của con người

    + Kiểm thử tự động không cần quá nhiều sự can thiệp của con người. Có thể chạy kiểm thử tự động qua đêm mà không cần giám sát.

    + Làm tăng tốc độ thực hiện kiểm thử

    + Giúp tăng phạm vi kiểm thử

-   Một số thuật ngữ

    + Công cụ kiểm thử tự động – automation testing tool

    + Kết quả mong đợi – expected result

    + Kết quả thực tế – actual result

    + Báo cáo kết quả kiểm thử – test report

----------------------------------------------------------
Các cấp độ trong kiểm thử

1. Unit Testing (Kiểm thử đơn vị)

Do Developer phụ trách, họ sẽ đi kiểm tra các module, các hàm, các phương thức, các lớp,… mà họ viết ra
nhằm gia tăng sự tin cậy cho các chức năng mà mình viết.

2. Integration Testing (Kiểm thử tích hợp)

kiểm thử sự tương tác giữa các chức năng với nhau trong hệ thống và được thực hiện bởi DEVELOPER hoặc TESTER.
Ví dụ: sau khi đã unit test chức năng đăng nhập và chức năng đăng ký thì ta có thể tiến hành kiểm thử tích hợp
của 2 chức năng này để xem chúng có tương tác tốt với nhau không, sau khi đăng ký thành công thì ta có thể
tiến hành đăng nhập bằng tài khoản đã đăng ký xem có thực hiện được không.

3. System Testing (Kiểm thử hệ thống)

Kiểm thử hệ thống là kiểm thử một hệ thống đã hoàn thành, đã tích hợp đầy đủ các chức năng nhằm kiểm tra xem
hệ thống phần mềm đó có đáp ứng đầy đủ các yêu cầu chức năng theo bản đặc tả yêu cầu phần mềm (SRS) hay không.
Người thực hiện test ở mức độ này thường là TESTER.


4. Acceptance Testing (Kiểm thử chấp nhận)

Mức độ kiểm thử phần mềm cuối cùng chính là Acceptance Test (Kiểm thử chấp nhận) – kiểm tra xem hệ thống
có đáp ứng đúng nhu cầu và mong đợi của khách hàng hay không.
Trong kiểm thử hệ thống, khách hàng sẽ kiểm tra xem phần mềm được viết có hoạt động đúng như mong đợi
của mình không, có đảm bảo tính tiện dụng, hiệu suất hoạt động có như mong đợi không, có bảo mật tốt hay không,….

     */



}
