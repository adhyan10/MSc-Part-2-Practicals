#Assignment Problem

#Importin lpSolve
library(lpSolve)

#set assignment cost matrix
costs=matrix(c(15,10,9,9,15,10,10,12,8),nrow=3,byrow = TRUE)

#print assignment costs matrix
costs

#Final value(z)
lp.assign(costs)

#variables final values
lp.assign(costs)$solution