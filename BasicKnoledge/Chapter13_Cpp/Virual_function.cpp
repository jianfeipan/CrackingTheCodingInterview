class Sharpe{
  public:
    int edge_length;
    virtual int circumference(){
      cout << "Circumference of Basic Class\n";
      return 0;
    }
};

class Triangle:public Shape{
  public:
    int circumference(){
      cout << "Circumference of Triangle Class\n";
      return 3*edge_length;
    }
};
void main(){
  Shape *x=new Shape();
  x->circumference();// prints “Circumference of Base Class”
  Shape *y=new Tirangle();
  y->circumference();// prints “Circumference of Triangle Class”
}
