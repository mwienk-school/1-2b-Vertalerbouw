java src.grammar.Grammar < test\RuntimeTests\testdivisionbyzero.txt > obj.tasm
java TAM.Assembler < obj.tasm > obj.tam
java TAM.Interpreter
java src.grammar.Grammar < test\RuntimeTests\testnotinitialized.txt > obj.tasm