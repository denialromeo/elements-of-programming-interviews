$file = get-childitem -filter "*$($args[0])*.java" | select-object -exp Name -first 1
$class = ([system.io.fileinfo]$file).basename
javac $file
java $class
remove-item *.class
