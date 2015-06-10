// import org.apache.commons.cli.*;

public class PNUMGEN
{
    public static void main(String[] args)
    {
		System.out.println("> PNUMGEN 1.0");
		System.out.println("> Yttrium 2015");
		System.out.println("> https://github.com/Yt-trium/PNUMGEN");
		
		if(args[0].length() == 10)
		{
			System.out.println(PNGoogle(args[0]));
		}
		else
		{
			System.out.println("usage : <PNUMGEN> <phoneNumber>");
			System.out.println("example : PNUMGEN 0123456789");
		}
		
		/*
		Options options = new Options();
		
		options.addOption( OptionBuilder.withArgName( "n" )
                                .withDescription( "Number" )
                                .hasArg()
                                .withArgName("SIZE")
                                .create() );
		
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse( options, args);
		
		String PN = cmd.getOptionValue("n");

		if(PN == null)
		{
			PN = "0123456789";
		}
		
		try
		{
			CommandLine line = parser.parse( options, args );
		}
		catch( ParseException exp )
		{
			System.err.println( "Parsing failed.  Reason: " + exp.getMessage() );
		}*/
    }
    
    private static String PNGoogle(String PN)
    {
		String OR = " OR ";
		String R = "";
		R += "\"";
		R += PN;
		R += "\"";
		int i,j;
		
		String symbol = ". -";
		
		for(i=0;i<symbol.length();i++)
		{
			R += OR;
			R += "\"";
			for(j=0;j<10;j++)
			{
				R += PN.charAt(j);
				if(j%2 == 1 && j != 9)
					R += symbol.charAt(i);;
			}
			R += "\"";
		}
		
		
		return R;
	}
}
