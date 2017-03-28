function play(x) {
	
	var textToBeInserted = "Cloud 99";
	
	
	// following is your xml file
	var phoneBook = <phoneBook>    

    <phoneEntry>         

        <name>Joe Schwartz</name>         

        <phoneNumber>342-2351</phoneNumber>    

    </phoneEntry>    

    <phoneEntry>         

        <name>Aleria Delamare</name>         

        <phoneNumber>342-7721</phoneNumber>    

    </phoneEntry>    

    <phoneEntry>         

        <name>Susan Sto Helit</name>         

        <phoneNumber>315-2987</phoneNumber>    

    </phoneEntry>    

    <phoneEntry>         

        <name>{textToBeInserted}</name>

         <phoneNumber>342-7219</phoneNumber>    

    </phoneEntry> 

</phoneBook>


	phoneBook.phoneEntry[0].name = "Yogesh Manware"
	return phoneBook;
}

// execute the function
play();

