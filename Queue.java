Class Queue {
 char q[];
 int putloc, getloc;
 
  Queue (int size) {
   q = new char[size];
   putloc = getloc = 0;
 } 
 void() put (char ch) {
 if (putloc==q.lenght){
  system.out.println(" -Queue is full.");
 return;
}
  q[putloc++] = ch; 
}
  char git() {
 if(getloc==putloc){
 system.out.println(" - Queue is empty");
  return (char) 0;
}
 return q[getloc++];
  }
}