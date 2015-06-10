import org.apache.commons.cli.*;

public class Main
{
    public static void main(String[] args)
    {
		System.out.println("> PNUMGEN 1.0");
		System.out.println("> Yttrium 2015");
		System.out.println("> https://github.com/Yt-trium/PNUMGEN");
		
		// create Options object
		Options options = new Options();

		// add p option
		options.addOption("p", false, "generate points");
		// create the parser
    CommandLineParser parser = new DefaultParser();
    try {
        // parse the command line arguments
        CommandLine line = parser.parse( options, args );
    }
    catch( ParseException exp ) {
        // oops, something went wrong
        System.err.println( "Parsing failed.  Reason: " + exp.getMessage() );
    }
		
    }
}
