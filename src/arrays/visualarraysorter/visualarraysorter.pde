//1. create an array of ints. don't initialize it yet.
int [] manyints;
void setup() {
  //2. set the size of your window
  size(500,500);
  //3. initialize your array with the built in width variable
manyints= new int [width];
//4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
for(int i=0; i<manyints.length; i++){
  manyints [i]= (int)random(height);
}
  //5. call the noStroke() method
noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
background(50,50,50);
  //7. set the color for your graph
color(100,200,30);
  //8. draw a rectangle for each int in your array.
  for(int i=0; i<manyints.length; i++){
    rect(i,height,1,-manyints[i]);
  }
  //   the x value will be the current index in the array
  //   the y value will the height variable
  //   the width is 1 (one)
  //   the height is negative the value of the element at the current index of the array
stepSort(manyints);

  //9. call the stepSort method

  //10. extract the code that randomizes the array into a method.

  //11. call the method you made in step 10 when the mouse is pressed

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
