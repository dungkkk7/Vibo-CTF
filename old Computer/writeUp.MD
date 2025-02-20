[HIHI]
undefined8 Main(void)

{
  uint v1;
  undefined4 v2;
  int isValid;
  char input [21];
  undefined local_d3;
  undefined4 secret [22];
  uint key;
  int index;
  
  index = 0;
  secret[0] = 0xd9;
  secret[1] = 0xfe;
  secret[2] = 0xc5;
  secret[3] = 0xf4;
  secret[4] = 0x9e;
  secret[5] = 199;
  secret[6] = 0x9b;
  secret[7] = 0xdc;
  secret[8] = 0xe7;
  secret[9] = 0xd2;
  secret[10] = 0xf4;
  secret[0xb] = 0x93;
  secret[0xc] = 0xfe;
  secret[0xd] = 0xff;
  secret[0xe] = 0xf4;
  secret[0xf] = 0x9e;
  secret[0x10] = 0xde;
  secret[0x11] = 0xf9;
  secret[0x12] = 0xce;
  secret[0x13] = 0xe7;
  secret[0x14] = 0xd2;
  key = 0xab;
  puts(
      "I\'m one of oldest runable program on the earth.\nCompiled with gcc 0.01, run fast as hell on  Pentium I.\nLet me check your passphrase.\n"
      );
  printf("Enter your passphrase: ");
  __isoc99_scanf(&DAT_00400936,input);
  local_d3 = 0;
  puts("Okay, gimme some time...some time...");
  index = 0;
  while( true ) {
    if (0x14 < index) {
      puts("It\'s all correct, submit it as Flag{place_passphrase_here}.");
      return 0;
    }
    //secret đc xỏr với key -> flag nó ktra sem giá trị mình vào có bằng giá trị xor k nếu k thì break hết 
    v1 = donothing(secret[index]);
    v1 = v1 ^ key;
    v2 = donothing((int)input[index]);
    isValid = checkV1!=V2(v2,v1); // hàm này so sanh hết 
    if (isValid != 0) break;
    index = index + 1;
  }
  puts("Well, this is WRONG for sure !");
  return 0;
}

[solution chỉ viễc in ra ]   v1 = v1 ^ key; -> flag 