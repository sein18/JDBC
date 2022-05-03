# JDBC (Java database connectivity)

* __JDBC (Java database connectivity)__ : 자바에서 데이터베이스에 접근할 수 있게 해주는 `Programming API`

---

* __JDBC 사용객체__ 

  * __DriverManager__

    * 데이터 원본에 JDBC드라이버를 통하여 커넥션을 만드는 역할을 한다.
    * `Class.forName()`메소드를 통해 생성되며 반드시 예외처리를 해야한다.
    * 직접 객체 생성이 불가능하고 `getConnection()`메소드를 사용하여 객체 생성이 가능하다.

  * __Connection__

    * 특정 데이터 원본과 연결된 커넥션을 나타내며 Statement객체를 생성할 때도 Connection객체를

      사용하여 createStatement() 메소드를 호출하여 생성 

    * SQL문장을 실행시키기 저에 우선 Connection객체가 있어야 한다.

  * __Statement__

    * Connection객체에 의해 프로그램에 리턴되는 객체에 의해 구현되는 일종의 메소드 집합 정의.

    * Connection클래스의 createStatement() 메소드를 호출하여 얻어지며 생성된 Statement객체로 질

      의문장을 String객체에 담아 인자로 전달하여 executeQuery() 메소드를 호출하여 SQL의 수행

  * __PreparedStatement__

    * Connection객체의 preparedStatement() 메소드를 사용하여 객체 생성 
    * SQL문장이 미리 컴파일 되고 실행 시간동안 인수 값을 위한 공간을 확보한다는 점에서 Statement와 다르다.

  * __ResultSet__

    * SELECT문을 사용한 질의 성공 시 Result Set 반환 
    * SQL질의에 의해 생성된 테이블을 담고 있으며 커서(cursor)로 특정 행에 대한 참조 조작

---

* __코드__

```java
Class.forName("com.mysql.jdbc.Driver");//JDBC드라이버
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/multi","root","1234");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT *FROM MYTEST(테이블)");
//rs에는 테이블 형태 그대로 데이터를 가져온다.
```

