/*
 * Copyright (c) 2002-2007, Marc Prud'hommeaux. All rights reserved.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 */

package jline.console.history;

import java.io.IOException;

/**
 * Persistent {@link History}.
 *
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 * @since 2.3
 */
public interface PersistentHistory
    extends History
{
    /**
     * Flush all items to persistent storage.
     *
     * @throws IOException  Flush failed
     */
    void flush() throws IOException;

    /**
     * Purge persistent storage and {@link #clear}.
     *
     * @throws IOException  Purge failed
     */
    void purge() throws IOException;
}