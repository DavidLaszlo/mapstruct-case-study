package com.github.davidl.mappers.basic.movies;

import com.github.davidl.mappers.basic.movies.qualifiers.EnglishToGerman;
import com.github.davidl.mappers.basic.movies.qualifiers.GermanToEnglish;
import com.github.davidl.mappers.basic.movies.qualifiers.TitleTranslator;

@TitleTranslator
public class Titles {

	@GermanToEnglish
	public String translateTitleGE(final String title) {
		// some mapping logic
		return "En: " + title;
	}

	@EnglishToGerman
	public String translateTitleEG(final String title) {
		// some mapping logic
		return "De: " + title;
	}
}
