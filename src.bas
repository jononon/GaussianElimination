Disp "GaussElim by Jon Damico"
Disp "-----------------------"
Disp "Please enter the matrix"
Disp "You would like to Simplify"

Input [J]

dim([J])→⌊L11

For(I,1,⌊L11(1))
For(J,I+1,⌊L11(1))
If [J](I,I)≠0
*row+(­([J](J,I)/[J](I,I)),[J],I,J)→[J]
End
End

Disp [J]FD
