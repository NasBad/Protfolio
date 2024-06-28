.data 
x: .word 10
y: .byte 5

.text 
lw $t2,x
lb $t3,y
add $t1,$t2,$t3