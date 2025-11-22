param(
  [string]$ProjectRoot = "$(Split-Path -Parent $MyInvocation.MyCommand.Path)",
  [string]$PKG_NAME = "{PKG_NAME}",
  [string]$STUDENT_ID = "{STUDENT_ID}"
)


javac -d "$ProjectRoot\out" "$ProjectRoot\src\${PKG_NAME}\q1\Q1.java" "$ProjectRoot\src\${PKG_NAME}\OutputUtil.java"

$run = java -cp "$ProjectRoot\out" ${PKG_NAME}.q1.Q1 2>&1

$run | Out-File -FilePath "$ProjectRoot\output_q1_${STUDENT_ID}.txt" -Encoding utf8

Write-Host "Run output saved to output_q1_${STUDENT_ID}.txt"
