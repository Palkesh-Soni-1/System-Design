public class User {
    private String name;
    private String uName;
    private String phoneNumber;
    private String address;
    private String parentName;
    private int age;
    private String accountNo;

    public String getName() {
        return name;
    }

    public String getuName() {
        return uName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getParentName() {
        return parentName;
    }

    public int getAge() {
        return age;
    }

    public String getAccountNo() {
        return accountNo;
    }

    private User(UserBuilder userBuilder){
        this.accountNo=userBuilder.accountNo;
        this.name=userBuilder.name;
        this.address= userBuilder.address;
        this.uName=userBuilder.uName;
        this.phoneNumber= userBuilder.phoneNumber;
        this.parentName= userBuilder.parentName;
        this.age= userBuilder.age;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Name: ")
                .append(this.name)
                .append("\nAge: ")
                .append(this.age)
                .append("\nAddress: ")
                .append(this.address)
                .append("\nUsername: ")
                .append(this.uName)
                .append("\nPhone Number: ")
                .append(this.phoneNumber)
                .append("\nAccount Number: ")
                .append(this.accountNo)
                .append("\nParent Name: ")
                .append(this.parentName)
                .toString();
    }

    public static class UserBuilder{
        private String name;
        private String uName;
        private String phoneNumber;
        private String address;
        private String parentName;
        private int age;
        private String accountNo;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setuName(String uName) {
            this.uName = uName;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setParentName(String parentName) {
            this.parentName = parentName;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
