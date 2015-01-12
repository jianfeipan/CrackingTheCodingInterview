/*
Write a method to print the last K lines of an input file using C++.
*/
string L[K];
int lines=0;
while(file.good()){
  getline(file,L[lines%K]);
  ++lines;
}

int start,count;
if(lines<K){
  start=0;
  count=lines;
}else{
  start=lines%K;
  count=K;
}
for(int i=0; i<count;++i){
  count<<L[(start+i)%K]<<end1;
}
