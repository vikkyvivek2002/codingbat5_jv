public boolean parrotTrouble(boolean talking, int hour) {
  boolean trouble = true;
  if(hour<7 && talking ==true){
    trouble = true ;
  }
  else if(hour>20 && talking == true ){
    trouble = true; 
  }
  else{
    trouble = false;
  }
return trouble;
}
