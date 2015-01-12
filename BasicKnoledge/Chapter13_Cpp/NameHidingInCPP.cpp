class FirstClass{
  public:
    virtual void MethodA(int);
    virtual void MethodA(int, int);
};
void FirstClass::MethodA(int i){
  std::cout <<"ONE!\n";
}
void FirstClass::MethodA(int i, int i){
  std::cout <<"TWO!!\n";
}

class SecondClass{
  public: 
    void MethodA(int);
};
void SecondClass::MethodA(int i){
  std::cout << "Tree!!!\n";
}

void main(){
  SecondClass a;
  a.MethodA(1);
  a.MethodA(1,1);/*However, the second call won’t work, since the two-parameter MethodA is not visible. That is name hiding.*/
}
