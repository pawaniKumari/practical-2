object Main extends App {
  
  //Q1
  var k,i,j = 2;
  var m,n = 5;
  var f = 12.0f;
  var g = 4.0f;
  var c = 'X';

  println(k + 12 * m);
  println(m / j);
  println(n % j);
  println(m / j * j);
  println(f + 10 *  5 + g);
  i+=1;
  println(i * n);

  //Q2
  var a:Int = 2;
  var b:Int = 3;
  var c:Int = 4;
  var d:Int = 5;
  var k:Float = 4.3f;

  b-=1; d-=1;
  println(b * a + c * d);
  a+=1;
  println(a);
  println ((-2) * ( a - k ) + c);
  c+=1;
  println (c);
  c+=1;
  a+=1;
  println (c*a);

  //Q3
  def normalSalary(hn:Int)=hn * 250;
  def otSalary(hot:Int)=hot * 85;
  def income(hn:Int,hot:Int)=normalSalary(hn) + otSalary(hot);
  def tax(income:Double)= income * 0.12;
  def takeHomeSalary(hn:Int,hot:Int)= income(hn,hot) - tax(income(hn,hot));

  println(takeHomeSalary(40,30));

  //Q4
  def attendees(price:Int):Int = 120 + (15 - price) / 5 * 20;
  def income(price:Int):Int = attendees(price) * price;
  def cost(price:Int):Int = 500 + attendees(price);
  def profit(price:Int):Int = income(price) - cost(price);

  println(profit(5));


}