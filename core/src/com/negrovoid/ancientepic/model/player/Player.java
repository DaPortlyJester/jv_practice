package com.negrovoid.ancientepic.model.player;

import com.negrovoid.ancientepic.model.character.GameCharacter;

import java.util.List;

/**
 * @author DaPortlyJester
 * @date 10/4/2014.
 */
public interface Player {

    public List<GameCharacter> getCharacters();

    public List<CharacterRecord> getCharacterRecords();


}
