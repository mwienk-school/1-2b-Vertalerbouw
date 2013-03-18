package src.grammar;

import java.io.*;
import org.antlr.runtime.*;             // ANTLR runtime library
import org.antlr.runtime.tree.*;        // For ANTLR's Tree classes
import org.antlr.stringtemplate.*;      // For the DOTTreeGenerator
import src.myTree.*;
import src.symbolTable.*;

/** 
 * Program that creates and starts the Grammar lexer, parser, etc.
 */
public class Grammar {
    private static boolean  opt_ast             = false,
                            opt_dot             = false,
                            opt_no_checker      = false,
                            opt_no_codegen  	= false;
    
    
    
    /**
     * Parse de opties  meegegeven aan het programma
     * @param args String[] met de argumenten
     */
    public static void parseOptions(String[] args) {
    	
        for (int i=0; i<args.length; i++) {
            if (args[i].equals("-ast"))
                opt_ast = true;
            else if (args[i].equals("-dot"))
                opt_dot = true;
            else if (args[i].equals("-no_checker"))
                opt_no_checker = true;
            else if (args[i].equals("-no_codegen"))
                opt_no_codegen = true;
            else {
                System.err.println("error: unknown option '" + args[i] + "'");
                System.err.println("valid options: -ast -dot " +
                                   "-no_checker -no_codegen");
                System.exit(1);
            }
        }
    }
        
    /**
     * Start de Lexer, dan de Parser. Als er geen fouten op getreden zijn wordt de checker gestart.
     * Als de checker geen fouten oplevert wordt de codegenerator gestart.
     * De codegenerator kan niet gestart worden zonder dat de checker heeft gelopen, omdat de checker informatie 
     * toevoegt aan de AST
     * @param args String[] met de argumenten voor het programma
     */
    public static void main(String[] args) {
        parseOptions(args);
        
        try {
        	//Start de lexer
            GrammarLexer lexer = new GrammarLexer(new ANTLRInputStream(System.in));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            //Start de parser
            GrammarParser parser = new GrammarParser(tokens); 
            parser.setTreeAdaptor(new MyTreeAdaptor()); 
                       
            GrammarParser.program_return result = parser.program();
            if(!(result.getTree() instanceof CommonErrorNode)) {							
            	MyTree tree = (MyTree) result.getTree();  			
				
				if (opt_ast) {          // print the AST as string
					System.out.println(tree.toStringTree());
				} else if (opt_dot) {   // print the AST as DOT specification
					DOTTreeGenerator gen = new DOTTreeGenerator(); 
					StringTemplate st = gen.toDOT(tree); 
					System.out.println(st);
				}
				
                int count = 0;    
            
                //Start de checker
	            if(!opt_no_checker) {
	           		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
	            	GrammarChecker checker = new GrammarChecker(nodes);
	            	count = checker.program();
			    }       
	            
	            //Start de codegenerator
				if(!opt_no_codegen && count == 0) {
					
					CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(tree);
					GrammarCodeGenerator codegenerator = new GrammarCodeGenerator(nodes2);
					codegenerator.program();
				}
				
			}
            
          
        } catch (RecognitionException e) { /* print recognitionexceptions deze worden gegooit als recognition
        				exceptions door de lexer/parser en als GrammarExceptions door de Checker*/ 
            System.err.print("ERROR: recognition exception thrown by compiler: ");
            System.err.println(e.getMessage());
            //e.printStackTrace();
        } catch (Exception e) { // zouden nooit gegooit mogen worden
            System.err.print("ERROR: uncaught exception thrown by compiler: ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
