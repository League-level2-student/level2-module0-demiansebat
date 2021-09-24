int [] manyints;
void setup() {
size(500,500);
manyints= new int [width];
randomizer();
noStroke();
}
void draw() {
background(0,0,0);
fill(random(255), random(255), random(255), random(255));
  for(int i=0; i<manyints.length; i++){
    rect(i,height,1,-manyints[i]);
  }
stepSort(manyints);
if(mousePressed){
  randomizer();
}}
void randomizer(){
  for(int i=0; i<manyints.length; i++){
  manyints [i]= (int)random(height);
}
}
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
