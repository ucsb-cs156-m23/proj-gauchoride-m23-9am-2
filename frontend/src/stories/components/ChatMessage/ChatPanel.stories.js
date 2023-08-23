import React from 'react';
import { apiCurrentUserFixtures } from "fixtures/currentUserFixtures";
import { systemInfoFixtures } from "fixtures/systemInfoFixtures";
import { onePagedChatFixtures } from "fixtures/chatMessageFixtures";
import { rest } from "msw";
import ChatPanel from 'main/components/ChatMessage/ChatPanel';

export default {
    title: 'pages/ChatMessage/ChatPanel',
    component: ChatPanel
};

const Template = () => <ChatPanel />;

export const Default = Template.bind({});
Default.parameters = {
    msw: [
        rest.get('/api/currentUser', (_req, res, ctx) => {
            return res(ctx.json(apiCurrentUserFixtures.adminUser));
        }),
        rest.get('/api/systemInfo', (_req, res, ctx) => {
            return res(ctx.json(systemInfoFixtures.showingNeither));
        }),
        rest.get('/api/chat/get', (_req, res, ctx) => {
            return res(ctx.json({
                content: [], totalPages: 0
                },));
        }),
    ]
}

export const onePage = Template.bind({});

onePage.parameters = {
    msw: [
        rest.get('/api/currentUser', (_req, res, ctx) => {
            return res( ctx.json(apiCurrentUserFixtures.adminUser));
        }),
        rest.get('/api/systemInfo', (_req, res, ctx) => {
            return res(ctx.json(systemInfoFixtures.showingNeither));
        }),
        rest.get('/api/chat/get', (_req, res, ctx) => {
            return res(ctx.json(onePagedChatFixtures));
        }),
    ],
}

