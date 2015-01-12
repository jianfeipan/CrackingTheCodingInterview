/*Smart_ptr is the same as a normal pointer, but it provides safety via automatic memory. It avoids dangling pointers, memory leaks, allocation failures etc. The smart pointer must maintain a single reference count for all instances.*/
template <class T> class SmartPointer{
  public:
    SmartPointer(T *prt){
      ref=ptr;
      ref_cout=(unsigned*)malloc(sizeof(unsigned));
      *ref_count=1;
    }
    SmartPointer(SmartPointer<T> &sptr){
      ref=sptr.ref;
      ref_count = sptr.ref_count;
      ++*ref_count;
    }
    SmartPointer<T> & operator=(SmartPointer<T> & sptr) {
      if(this!=&sptr){
        ref=sptr.ref;
        ref_count=sptr.ref_count;
        ++*ref_count;
      }
      return *this;
    }
    ~SmartPointer(){
      --*ref_count;
      if(*ref_count==0){
        delete ref;
        free(ref_count);
        ref = NULL;
        ref_count=NULL;
      }
    }
    
    T getValue(){
      return *ref;
    }
    
  protected:
    T *ref;
    unsigned *ref_count;
}
