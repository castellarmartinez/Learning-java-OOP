### Pixel Quantization

Use a one-dimensional array to solve the following problem: You want
to eventually perform some basic compression on an image. Assume that you will only be operating
on a single row of the image, and that pixel colors are represented as simple numbers in the array. You
are required to quantize the values of the pixels in the row. In other words, any pixel values appearing
in a range will assume a value in that range as indicated below. This creates redundancy that can lead
to better compression. Overwrite the original values in the array.

a) For 0–20: 10\
b) For 21–40: 30\
c) For 41–60: 50\
d) For 61–80: 70\
e) For 81–100: 90\
f) For 101–120: 110\
g) For 121–140: 130\
h) For 141–160: 150\
i) For 161–180: 170, and for all other pixel values, assumed a quantized value of 190
Print the array with the new, quantized values.