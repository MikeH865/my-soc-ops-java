package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 *
 * Theme: Tech Life 🖥️
 * A chaotic mix of coding habits, IDE preferences, and developer culture
 * prompts. Includes easy wins, conversation-sparking confessions, bold
 * career moments, and wildcard action squares.
 *
 * Difficulty guide:
 *   Easy Win  — everyday dev truths most people share (prompts 1–10)
 *   Medium    — habits or opinions that invite a story  (prompts 11–17)
 *   Bold      — career confessions that get a reaction  (prompts 18–22)
 *   Wildcard  — live action squares to spark interaction (prompts 23–24)
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            // ── Easy Wins ────────────────────────────────────────────────
            "uses dark mode on every single screen",
            "has 10+ browser tabs open right now",
            "has copy-pasted from Stack Overflow today",
            "has a rubber duck (or mascot) on their desk",
            "debugs with print statements instead of a debugger",
            "has forgotten a semicolon and spent 20+ min on it",
            "has named a variable 'temp', 'temp2', or 'foo'",
            "has committed directly to main at least once",
            "uses VS Code as their main IDE",
            "has Googled an error message in the last hour",
            // ── Medium ───────────────────────────────────────────────────
            "has a TODO comment in their code older than 6 months",
            "prefers spaces over tabs (and has feelings about it)",
            "can touch-type without glancing at the keyboard",
            "prefers CLI over GUI for almost everything",
            "has strong opinions about curly brace placement",
            "has written a regex from scratch — no copy-pasting",
            "has more unread Slack/Teams notifications than they'll admit",
            // ── Bold ─────────────────────────────────────────────────────
            "has blamed the compiler before realising it was their own bug",
            "has rage-quit an IDE at least once in their career",
            "has rewritten 'perfectly fine' code just because it bothered them",
            "has named a variable after a food, snack, or pet",
            "has accidentally pushed a secret or API key (and fixed it fast)",
            // ── Wildcards 🃏 ──────────────────────────────────────────────
            "🃏 Wildcard: Teach someone a keyboard shortcut they don't know — right now!",
            "🃏 Wildcard: Defend your tabs-vs-spaces stance to the nearest person for 10 seconds"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
