package day3.passingparameters;

public class Calculator {

 void add(int a, int b) { // 20, 10
a = a + b; // 30
b = 30; // 30
}

 void add(String a, String b) { //String
a = a + b;
b = "Sorry i am modifying your string.";
}

 void add(Message a, Message b) { //add the object + string addition
a.msg = a.msg + b.msg;
b.msg = "Sorry i am modifying your string.";
}
void add(Message a, Message b, int c) { //add the object + int addition
a.code = a.code + c;
b.code = 100;
}

}