struct strpair
{
 char a[10];
};

program STR_PROG
{
 version STR_VERS
 {
  string PALI(strpair)=1;
  string REV(strpair)=2;
}=1;
}=0x12345678;