/*
Calling a method with an object pointer always invokes:
»»the most derived class function, if a method is virtual.
»»the function implementation corresponding to the object pointer type (used to call the method), if a method is non-virtual.
A virtual destructor works in the same way. A destructor gets called when an object goes out of scope or when we call delete on an object pointer.
When any derived class object goes out of scope, the destructor of that derived class gets called first. It then calls its parent class destructor so memory allocated to the object is properly released.
But, if we call delete on a base pointer which points to a derived class object, the base class destructor gets called first (for non-virtual function). For example:
*/
