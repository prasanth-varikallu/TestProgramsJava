//package Builders;
//
//import java.util.HashMap;
//
//public class User {
//
//    private final String name;
//    private final String phoneNumber;
//    private final String status;
//
//    public static class Builder {
//        private final String name;
//
//        public String getPhoneNumber() {
//            return phoneNumber;
//        }
//
//        public String getStatus() {
//            return status;
//        }
//
//        private final String phoneNumber;
//        private String status = "Active";
//
//        public Builder(String name, String phoneNumber) {
//            this.name = name;
//            this.phoneNumber = phoneNumber;
//        }
//
//        public Builder status(String status) {
//            this.status = status;
//            return this;
//        }
//
//        public User build() {
//            return new User(this);
//        }
//
//    }
//
//    private User(Builder builder) {
//        name = builder.name;
//        phoneNumber = builder.phoneNumber;
//        status = builder.status;
//
//    }
//
//    public static void main (String [] args) {
//        final var users = new HashMap<String, User>();
//
//        users.put("Aditya",
//                new User.Builder("Aditya", "12345")
//                .status("Active")
//                .build()
//        );
//        users.put("Prasanth",
//                new User.Builder("Prasanth", "12345")
//                        .status("Active")
//                        .build()
//        );
//        users.forEach((k, v) -> System.out.println("Name: " + k + " Phone: " + v.phoneNumber));
//    }
//
//}
