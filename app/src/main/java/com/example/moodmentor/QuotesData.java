package com.example.moodmentor;

import java.util.ArrayList;
import java.util.List;

public class QuotesData {

    public static List<QuotesList> getMotivQuotes() {

        final List<QuotesList> motivQuotesList = new ArrayList<>();

        QuotesList motivQuote1 = new QuotesList("Life is a mountain. Your goal is to find your path, not to reach the top.", "- Bruce Lee");
        motivQuotesList.add(motivQuote1);

        QuotesList motivQuote2 = new QuotesList("Don't watch the clock; do what it does. Keep going.", "- Sam Levenson");
        motivQuotesList.add(motivQuote2);

        QuotesList motivQuote3 = new QuotesList("Believe you can and you're halfway there.", "- Theodore Roosevelt");
        motivQuotesList.add(motivQuote3);

        QuotesList motivQuote4 = new QuotesList("The future belongs to those who believe in the beauty of their dreams.", "- Eleanor Roosevelt");
        motivQuotesList.add(motivQuote4);

        QuotesList motivQuote5 = new QuotesList("The only way to do great work is to love what you do.", "- Steve Jobs");
        motivQuotesList.add(motivQuote5);

        QuotesList motivQuote6 = new QuotesList("Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful.", "- Albert Schweitzer");
        motivQuotesList.add(motivQuote6);

        QuotesList motivQuote7 = new QuotesList("The secret of getting ahead is getting started.", "- Mark Twain");
        motivQuotesList.add(motivQuote7);

        QuotesList motivQuote8 = new QuotesList("The only limit to our realization of tomorrow will be our doubts of today.", "- Franklin D. Roosevelt");
        motivQuotesList.add(motivQuote8);

        QuotesList motivQuote9 = new QuotesList("It does not matter how slowly you go as long as you do not stop.", "- Confucius");
        motivQuotesList.add(motivQuote9);

        QuotesList motivQuote10 = new QuotesList("In the midst of chaos, there is also opportunity.", "- Sun Tzu");
        motivQuotesList.add(motivQuote10);

        QuotesList motivQuote11 = new QuotesList("Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.", "- Christian D. Larson");
        motivQuotesList.add(motivQuote11);


        return motivQuotesList;
    }


    public static List<QuotesList> getSadQuotesList() {

        final List<QuotesList> sadQuotesList = new ArrayList<>();

        QuotesList sadQuote1 = new QuotesList("For every minute you are sad you lose sixty second of happiness", "- Ralph Waldo");
        sadQuotesList.add(sadQuote1);

        QuotesList sadQuote2 = new QuotesList("Every day may not be good... but there's something good in every day.", "- Alice Morse Earle");
        sadQuotesList.add(sadQuote2);

        QuotesList sadQuote3 = new QuotesList("Believe that life is worth living and your belief will help create the fact.", "- William James");
        sadQuotesList.add(sadQuote3);

        QuotesList sadQuote4 = new QuotesList("When one door of happiness closes, another opens.", "- Helen Keller");
        sadQuotesList.add(sadQuote4);

        QuotesList sadQuote5 = new QuotesList("Happiness can be found, even in the darkest of times, if one only remembers to turn on the light.", "- J.K. Rowling");
        sadQuotesList.add(sadQuote5);

        QuotesList sadQuote6 = new QuotesList("Sadness flies away on the wings of time.", "- Jean de La Fontaine");
        sadQuotesList.add(sadQuote6);

        QuotesList sadQuote7 = new QuotesList("The best way to cheer yourself up is to try to cheer somebody else up.", "- Mark Twain");
        sadQuotesList.add(sadQuote7);

        QuotesList sadQuote8 = new QuotesList("Keep your face to the sunshine and you cannot see a shadow.", "- Helen Keller");
        sadQuotesList.add(sadQuote8);

        QuotesList sadQuote9 = new QuotesList("This too shall pass.", "- Persian Sufi Poets");
        sadQuotesList.add(sadQuote9);

        QuotesList sadQuote10 = new QuotesList("Although the world is full of suffering, it is also full of the overcoming of it.", "- Helen Keller");
        sadQuotesList.add(sadQuote10);

        QuotesList sadQuote11 = new QuotesList("The pain you feel today will be the strength you feel tomorrow.", "- Unknown");
        sadQuotesList.add(sadQuote11);

        return sadQuotesList;

    }


    public static List<QuotesList> getHappyQuotesList() {

        final List<QuotesList> happyQuotesList = new ArrayList<>();

        QuotesList happyQuote1 = new QuotesList("Happiness is not something ready-made. It comes from your own actions.", "- Dalai lama");
        happyQuotesList.add(happyQuote1);

        QuotesList happyQuote2 = new QuotesList("The most important thing is to enjoy your life—to be happy—it's all that matters.", "- Audrey Hepburn");
        happyQuotesList.add(happyQuote2);

        QuotesList happyQuote3 = new QuotesList("Happiness is the secret to all beauty. There is no beauty without happiness.", "- Christian Dior");
        happyQuotesList.add(happyQuote3);

        QuotesList happyQuote4 = new QuotesList("The purpose of our lives is to be happy.", "- Dalai Lama");
        happyQuotesList.add(happyQuote4);

        QuotesList happyQuote5 = new QuotesList("Happiness is not a goal...it's a by-product of a life well-lived.", "- Eleanor Roosevelt");
        happyQuotesList.add(happyQuote5);

        QuotesList happyQuote6 = new QuotesList("The power of finding beauty in the humblest things makes home happy and life lovely.", "- Louisa May Alcott");
        happyQuotesList.add(happyQuote6);

        QuotesList happyQuote7 = new QuotesList("Folks are usually about as happy as they make their minds up to be.", "- Abraham Lincoln");
        happyQuotesList.add(happyQuote7);

        QuotesList happyQuote8 = new QuotesList("I've got nothing to do today but smile.", "- Paul Simon");
        happyQuotesList.add(happyQuote8);

        QuotesList happyQuote9 = new QuotesList("True happiness arises, in the first place, from the enjoyment of one’s self.", "- Joseph Addison");
        happyQuotesList.add(happyQuote9);

        QuotesList happyQuote10 = new QuotesList("Happiness is a gift and the trick is not to expect it, but to delight in it when it comes.", "- Charles Dickens");
        happyQuotesList.add(happyQuote10);

        return happyQuotesList;

    }
}


