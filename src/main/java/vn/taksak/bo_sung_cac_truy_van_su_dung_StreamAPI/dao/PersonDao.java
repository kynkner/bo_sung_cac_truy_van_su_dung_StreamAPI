package vn.taksak.bo_sung_cac_truy_van_su_dung_StreamAPI.dao;

import org.springframework.context.annotation.Primary;
import vn.taksak.bo_sung_cac_truy_van_su_dung_StreamAPI.model.Person;

import java.util.List;
import java.util.Map;

@Primary
public interface PersonDao {
    void printListPeople(List<Person> persons);

    List<Person> getAll(); //Liệt kê danh sách tất cả

    List<Person> sortPeopleByFullName(); //Liệt kê danh sách sắp xếp theo tên full name từ A-Z

    List<Person> sortPeopleByFullNameReversed(); //Liệt kê danh sách sắp xếp theo tên full name từ Z-A

    List<String> getSortedJobs(); //Lấy danh sách tất cả nghề nghiệp đã được sắp xếp từ A-Z

    List<String> getSortedCities(); //Lấy danh sách tất cả thành phố đã được sắp xếp từ A-Z

    List<String> femaleNames(); // Lấy danh sách tất cả tên của những người có giới tính nữ

    Person highestEarner(); // Tìm người có mức lương cao nhất

    List<Person> bornAfter1990(); // Lọc ra những người có năm sinh sau năm 1990

    double averageSalary(); // Tính lương trung bình của mọi người

    double averageAge(); // Tính tuổi trung bình của mọi người

    List<Person> nameContains(String keyword); // Lọc ra các person trong tên có chứa keyword

    List<Person> sortedByAgeForMale(); // Sắp xếp tuổi của những người có giới tính Male giảm dần

    Person longestName(); // Tìm người có tên dài nhất

    List<Person> aboveAverageSalary(); // Lấy danh sách những người có mức lương lớn hơn mức lương trung bình

    Map<String, List<Person>> groupPeopleByCity(); //Gom tất cả những người trong cùng một thành phố lại

    /* - Hanoi
          - Nguyen Văn X  |
          - Nguyên Văn Y  | -> List<Person>
          - Bui Thi Z     |
        - New York
          - John Lenon
          - Iron Man
          - John Biden
        - Tokyo
          - Ajino Moto
          - Murakami
          - Kawazaki
    */
    Map<String, Long> groupJobByCount();  //Nhóm các nghề nghiệp và đếm số người làm mỗi nghề

    List<Person> inSalaryRange(int start, int end);

    List<Person> startsWith(String prefix);

    List<Person> sortByBirthYearDescending();

    List<Person> top5HighestPaid();

    List<Person> inAgeRange(int start, int end);

}
