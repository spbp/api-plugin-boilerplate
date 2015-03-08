/*
 * This file is part of sponge-boilerplate, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015 Felix Schmidt <http://homepage.rub.de/Felix.Schmidt-c2n/>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.boformer.boilerplate;

import com.google.common.base.Optional;

/**
 * This service can be used by plugins to set a notification message that is
 * displayed when a player joins the server.
 *
 * <p>The provider of the service can be obtained from the Sponge
 * {@code ServiceManager}</p>
 */
public interface NotificationService
{

    /**
     * Gets the currently set notification message, if there is one.
     * 
     * @return The message
     */
    Optional<String> getNotification();

    /**
     * Sets the notification message.
     * 
     * @param message The message
     */
    void setNotification(String message);

    /**
     * Removes the current notification message. After that, no message will be
     * displayed to the players until a new message is set.
     */
    void clearNotification();
}