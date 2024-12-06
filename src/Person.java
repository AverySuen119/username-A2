public abstract class Person {
      private String id;
      private String name;
      private String gender;
      private int age;
      private int phoneNumber;

      //Construct empty parameter function
      public Person(){

      }


      //Construct a method with all parameters
      public Person(String id,String name,String gender,int age,int phoneNumber) {
          this.id = id;
          this.name = name;
          this.gender = gender;
          this.age = age;
          this.phoneNumber = phoneNumber;
      }


      //get and set
      public String getId() {
          return id;
      }
      public void setId(String id) {
          this.id = id;
      }

      public String getName() {
          return name;
      }
      public void setName(String name) {
          this.name = name;
      }

      public String getGender() {
          return gender;
      }
      public void setGender(String gender) {
          this.gender = gender;
      }

      public int getAge() {
          return age;
      }
      public void setAge(int age) {
          this.age = age;
      }

      public int getPhoneNumber() {
          return phoneNumber;
      }
      public void setPhoneNumber(int phoneNumber) {
          this.phoneNumber = phoneNumber;
      }

      @Override
      public String toString(){
          return "ID: "+id+", Name: "+name+", Gender: "+gender+", Age: "+age+", Phone Number: "+phoneNumber;
      }


}
