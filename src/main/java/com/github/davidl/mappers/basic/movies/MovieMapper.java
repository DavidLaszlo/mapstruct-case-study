package com.github.davidl.mappers.basic.movies;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.github.davidl.mappers.basic.movies.qualifiers.GermanToEnglish;
import com.github.davidl.mappers.basic.movies.qualifiers.TitleTranslator;

@Mapper(uses = Titles.class)
public interface MovieMapper {

	@Mapping(target = "title", qualifiedBy = { TitleTranslator.class, GermanToEnglish.class })
	public OriginalRelease toEnglish(GermanRelease movies);

	// TODO davidl: I have no idea why this is not working
	// @Mapping(target = "title", qualifiedBy = { TitleTranslator.class, EnglishToGerman.class })
	// public GermanRelease toGerman(OriginalRelease movies);

}
